package uk.ac.kcl.mdeoptimise.dataloader;

import java.sql.SQLException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Listener used by a message consumer, 
 * which inserts every new message into the database.
 * 
 * @author Tamara
 *
 */
public class QueueMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage)message;
			try {
				Database.insertIntoDatabase(textMessage.getText());
			} catch (ClassNotFoundException | SQLException | JMSException e) {
				e.printStackTrace();
			}
	}
}