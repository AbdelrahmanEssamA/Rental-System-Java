/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemClasses;

/**
 *
 * @author Abdo
 */
public interface Subject {
    public void attachSubscriber(Subscriber subscriber);

    public void removeSubscriber(Subscriber subscriber);

    public void notifyAllSubscribers();
    
}
