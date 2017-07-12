package client;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

/**
 * Created by muru on Jul-11-17.
 */
public class Client {
    public static void main(String[] args) {

        HazelcastInstance hazelcastInstance= HazelcastClient.newHazelcastClient();

    }
}
