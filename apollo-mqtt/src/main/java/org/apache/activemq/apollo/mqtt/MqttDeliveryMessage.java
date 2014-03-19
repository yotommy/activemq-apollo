package org.apache.activemq.apollo.mqtt;

import org.apache.activemq.apollo.broker.protocol.RawMessage;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.hawtbuf.Buffer;

public class MqttDeliveryMessage extends RawMessage {
    private QoS qos;
    
    public MqttDeliveryMessage(Buffer payload) {
        super(payload);
    }

    public MqttDeliveryMessage(Buffer payload, QoS qos) {
        this(payload);
        this.qos = qos;
    }
    
    public QoS qos() {
        return qos;
    }
}
