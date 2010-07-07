/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * his work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.amqp.protocol.types;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Iterator;
import org.apache.activemq.amqp.protocol.AmqpCommand;
import org.apache.activemq.amqp.protocol.AmqpCommandHandler;
import org.apache.activemq.amqp.protocol.marshaller.AmqpEncodingError;
import org.apache.activemq.amqp.protocol.marshaller.AmqpMarshaller;
import org.apache.activemq.amqp.protocol.marshaller.Encoded;
import org.apache.activemq.amqp.protocol.types.IAmqpList;
import org.apache.activemq.util.buffer.Buffer;

/**
 * Represents a attach to the named Session
 * <p>
 * Indicate that a Session endpoint has been attached to a Connection. A Session MUST NOT be
 * mapped to more than one Connection at a time.
 * </p>
 */
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
//!!!!!!!!THIS CLASS IS AUTOGENERATED DO NOT MODIFY DIRECTLY!!!!!!!!!!!!//
//!!!!!!Instead, modify the generator in activemq-amqp-generator!!!!!!!!//
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
public interface AmqpAttach extends AmqpList, AmqpCommand {



    /**
     * options map
     */
    public void setOptions(AmqpOptions options);

    /**
     * options map
     */
    public AmqpOptions getOptions();

    /**
     * the Session name
     * <p>
     * The name of the Session whose endpoint has been attached to the Connection.
     * </p>
     * <p>
     * The Session name uniquely identifies an interaction between two peers. It is globally
     * unique among all open Sessions. Once a Session is cleanly closed, its name may be reused.
     * </p>
     */
    public void setName(Buffer name);

    /**
     * the Session name
     * <p>
     * The name of the Session whose endpoint has been attached to the Connection.
     * </p>
     * <p>
     * The Session name uniquely identifies an interaction between two peers. It is globally
     * unique among all open Sessions. Once a Session is cleanly closed, its name may be reused.
     * </p>
     */
    public void setName(AmqpSessionName name);

    /**
     * the Session name
     * <p>
     * The name of the Session whose endpoint has been attached to the Connection.
     * </p>
     * <p>
     * The Session name uniquely identifies an interaction between two peers. It is globally
     * unique among all open Sessions. Once a Session is cleanly closed, its name may be reused.
     * </p>
     */
    public AmqpSessionName getName();

    /**
     * true iff the Session endpoint has never been attached
     * <p>
     * This field, if set, indicates that the Session endpoint is newly created and has never
     * been attached to another endpoint.
     * </p>
     */
    public void setOpening(Boolean opening);

    /**
     * true iff the Session endpoint has never been attached
     * <p>
     * This field, if set, indicates that the Session endpoint is newly created and has never
     * been attached to another endpoint.
     * </p>
     */
    public void setOpening(boolean opening);

    /**
     * true iff the Session endpoint has never been attached
     * <p>
     * This field, if set, indicates that the Session endpoint is newly created and has never
     * been attached to another endpoint.
     * </p>
     */
    public void setOpening(AmqpBoolean opening);

    /**
     * true iff the Session endpoint has never been attached
     * <p>
     * This field, if set, indicates that the Session endpoint is newly created and has never
     * been attached to another endpoint.
     * </p>
     */
    public Boolean getOpening();

    /**
     * the id of the last command received
     * <p>
     * The id of the last received command. This field MUST be set if and only if the Session
     * has received commands. This field indicates where replay will begin when resuming a
     * Session.
     * </p>
     * <p>
     * A sequence-no encodes a serial number as defined in RFC-1982. The arithmetic, and
     * operators for these numbers are defined by RFC-1982.
     * </p>
     */
    public void setReceived(Long received);

    /**
     * the id of the last command received
     * <p>
     * The id of the last received command. This field MUST be set if and only if the Session
     * has received commands. This field indicates where replay will begin when resuming a
     * Session.
     * </p>
     * <p>
     * A sequence-no encodes a serial number as defined in RFC-1982. The arithmetic, and
     * operators for these numbers are defined by RFC-1982.
     * </p>
     */
    public void setReceived(long received);

    /**
     * the id of the last command received
     * <p>
     * The id of the last received command. This field MUST be set if and only if the Session
     * has received commands. This field indicates where replay will begin when resuming a
     * Session.
     * </p>
     * <p>
     * A sequence-no encodes a serial number as defined in RFC-1982. The arithmetic, and
     * operators for these numbers are defined by RFC-1982.
     * </p>
     */
    public void setReceived(AmqpSequenceNo received);

    /**
     * the id of the last command received
     * <p>
     * The id of the last received command. This field MUST be set if and only if the Session
     * has received commands. This field indicates where replay will begin when resuming a
     * Session.
     * </p>
     * <p>
     * A sequence-no encodes a serial number as defined in RFC-1982. The arithmetic, and
     * operators for these numbers are defined by RFC-1982.
     * </p>
     */
    public AmqpSequenceNo getReceived();

    /**
     * the Session timeout
     * <p>
     * The Session timeout indicates how long a detached endpoint will be kept without an
     * associated Connection. If not set, the endpoint will be kept indefinitely.
     * </p>
     */
    public void setTimeout(Long timeout);

    /**
     * the Session timeout
     * <p>
     * The Session timeout indicates how long a detached endpoint will be kept without an
     * associated Connection. If not set, the endpoint will be kept indefinitely.
     * </p>
     */
    public void setTimeout(long timeout);

    /**
     * the Session timeout
     * <p>
     * The Session timeout indicates how long a detached endpoint will be kept without an
     * associated Connection. If not set, the endpoint will be kept indefinitely.
     * </p>
     */
    public void setTimeout(AmqpUint timeout);

    /**
     * the Session timeout
     * <p>
     * The Session timeout indicates how long a detached endpoint will be kept without an
     * associated Connection. If not set, the endpoint will be kept indefinitely.
     * </p>
     */
    public Long getTimeout();

    /**
     * the desired txn-level
     */
    public void setTxnMode(AmqpTxnLevel txnMode);

    /**
     * the desired txn-level
     */
    public AmqpTxnLevel getTxnMode();

    /**
     * the maximum supported txn-level
     */
    public void setTxnSupport(AmqpTxnLevel txnSupport);

    /**
     * the maximum supported txn-level
     */
    public AmqpTxnLevel getTxnSupport();

    public static class AmqpAttachBean implements AmqpAttach{

        private AmqpAttachBuffer buffer;
        private AmqpAttachBean bean = this;
        private AmqpOptions options;
        private AmqpSessionName name;
        private AmqpBoolean opening;
        private AmqpSequenceNo received;
        private AmqpUint timeout;
        private AmqpTxnLevel txnMode;
        private AmqpTxnLevel txnSupport;

        AmqpAttachBean() {
        }

        AmqpAttachBean(IAmqpList<AmqpType<?, ?>> value) {

            for(int i = 0; i < value.getListCount(); i++) {
                set(i, value.get(i));
            }
        }

        AmqpAttachBean(AmqpAttach.AmqpAttachBean other) {
            this.bean = other;
        }

        public final AmqpAttachBean copy() {
            return new AmqpAttach.AmqpAttachBean(bean);
        }

        public final void handle(AmqpCommandHandler handler) throws Exception {
            handler.handleAttach(this);
        }

        public final AmqpAttach.AmqpAttachBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            if(buffer == null) {
                buffer = new AmqpAttachBuffer(marshaller.encode(this));
            }
            return buffer;
        }

        public final void marshal(DataOutput out, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError{
            getBuffer(marshaller).marshal(out, marshaller);
        }


        public final void setOptions(AmqpOptions options) {
            copyCheck();
            bean.options = options;
        }

        public final AmqpOptions getOptions() {
            return bean.options;
        }

        public void setName(Buffer name) {
            setName(TypeFactory.createAmqpSessionName(name));
        }


        public final void setName(AmqpSessionName name) {
            copyCheck();
            bean.name = name;
        }

        public final AmqpSessionName getName() {
            return bean.name;
        }

        public void setOpening(Boolean opening) {
            setOpening(TypeFactory.createAmqpBoolean(opening));
        }


        public void setOpening(boolean opening) {
            setOpening(TypeFactory.createAmqpBoolean(opening));
        }


        public final void setOpening(AmqpBoolean opening) {
            copyCheck();
            bean.opening = opening;
        }

        public final Boolean getOpening() {
            return bean.opening.getValue();
        }

        public void setReceived(Long received) {
            setReceived(TypeFactory.createAmqpSequenceNo(received));
        }


        public void setReceived(long received) {
            setReceived(TypeFactory.createAmqpSequenceNo(received));
        }


        public final void setReceived(AmqpSequenceNo received) {
            copyCheck();
            bean.received = received;
        }

        public final AmqpSequenceNo getReceived() {
            return bean.received;
        }

        public void setTimeout(Long timeout) {
            setTimeout(TypeFactory.createAmqpUint(timeout));
        }


        public void setTimeout(long timeout) {
            setTimeout(TypeFactory.createAmqpUint(timeout));
        }


        public final void setTimeout(AmqpUint timeout) {
            copyCheck();
            bean.timeout = timeout;
        }

        public final Long getTimeout() {
            return bean.timeout.getValue();
        }

        public final void setTxnMode(AmqpTxnLevel txnMode) {
            copyCheck();
            bean.txnMode = txnMode;
        }

        public final AmqpTxnLevel getTxnMode() {
            return bean.txnMode;
        }

        public final void setTxnSupport(AmqpTxnLevel txnSupport) {
            copyCheck();
            bean.txnSupport = txnSupport;
        }

        public final AmqpTxnLevel getTxnSupport() {
            return bean.txnSupport;
        }

        public void set(int index, AmqpType<?, ?> value) {
            switch(index) {
            case 0: {
                setOptions((AmqpOptions) value);
                break;
            }
            case 1: {
                setName((AmqpSessionName) value);
                break;
            }
            case 2: {
                setOpening((AmqpBoolean) value);
                break;
            }
            case 3: {
                setReceived((AmqpSequenceNo) value);
                break;
            }
            case 4: {
                setTimeout((AmqpUint) value);
                break;
            }
            case 5: {
                setTxnMode(AmqpTxnLevel.get((AmqpUbyte)value));
                break;
            }
            case 6: {
                setTxnSupport(AmqpTxnLevel.get((AmqpUbyte)value));
                break;
            }
            default : {
                throw new IndexOutOfBoundsException(String.valueOf(index));
            }
            }
        }

        public AmqpType<?, ?> get(int index) {
            switch(index) {
            case 0: {
                return bean.options;
            }
            case 1: {
                return bean.name;
            }
            case 2: {
                return bean.opening;
            }
            case 3: {
                return bean.received;
            }
            case 4: {
                return bean.timeout;
            }
            case 5: {
                if(txnMode == null) {
                    return null;
                }
                return txnMode.getValue();
            }
            case 6: {
                if(txnSupport == null) {
                    return null;
                }
                return txnSupport.getValue();
            }
            default : {
                throw new IndexOutOfBoundsException(String.valueOf(index));
            }
            }
        }

        public int getListCount() {
            return 7;
        }

        public IAmqpList<AmqpType<?, ?>> getValue() {
            return bean;
        }

        public Iterator<AmqpType<?, ?>> iterator() {
            return new AmqpListIterator<AmqpType<?, ?>>(bean);
        }


        private final void copyCheck() {
            if(buffer != null) {;
                throw new IllegalStateException("unwriteable");
            }
            if(bean != this) {;
                copy(bean);
            }
        }

        private final void copy(AmqpAttach.AmqpAttachBean other) {
            bean = this;
        }

        public boolean equals(Object o){
            if(this == o) {
                return true;
            }

            if(o == null || !(o instanceof AmqpAttach)) {
                return false;
            }

            return equals((AmqpAttach) o);
        }

        public boolean equals(AmqpAttach b) {

            if(b.getOptions() == null ^ getOptions() == null) {
                return false;
            }
            if(b.getOptions() != null && !b.getOptions().equals(getOptions())){ 
                return false;
            }

            if(b.getName() == null ^ getName() == null) {
                return false;
            }
            if(b.getName() != null && !b.getName().equals(getName())){ 
                return false;
            }

            if(b.getOpening() == null ^ getOpening() == null) {
                return false;
            }
            if(b.getOpening() != null && !b.getOpening().equals(getOpening())){ 
                return false;
            }

            if(b.getReceived() == null ^ getReceived() == null) {
                return false;
            }
            if(b.getReceived() != null && !b.getReceived().equals(getReceived())){ 
                return false;
            }

            if(b.getTimeout() == null ^ getTimeout() == null) {
                return false;
            }
            if(b.getTimeout() != null && !b.getTimeout().equals(getTimeout())){ 
                return false;
            }

            if(b.getTxnMode() == null ^ getTxnMode() == null) {
                return false;
            }
            if(b.getTxnMode() != null && !b.getTxnMode().equals(getTxnMode())){ 
                return false;
            }

            if(b.getTxnSupport() == null ^ getTxnSupport() == null) {
                return false;
            }
            if(b.getTxnSupport() != null && !b.getTxnSupport().equals(getTxnSupport())){ 
                return false;
            }
            return true;
        }

        public int hashCode() {
            return AbstractAmqpList.hashCodeFor(this);
        }
    }

    public static class AmqpAttachBuffer extends AmqpList.AmqpListBuffer implements AmqpAttach{

        private AmqpAttachBean bean;

        protected AmqpAttachBuffer(Encoded<IAmqpList<AmqpType<?, ?>>> encoded) {
            super(encoded);
        }

        public final void setOptions(AmqpOptions options) {
            bean().setOptions(options);
        }

        public final AmqpOptions getOptions() {
            return bean().getOptions();
        }

        public void setName(Buffer name) {
            bean().setName(name);
        }

        public final void setName(AmqpSessionName name) {
            bean().setName(name);
        }

        public final AmqpSessionName getName() {
            return bean().getName();
        }

        public void setOpening(Boolean opening) {
            bean().setOpening(opening);
        }

        public void setOpening(boolean opening) {
            bean().setOpening(opening);
        }


        public final void setOpening(AmqpBoolean opening) {
            bean().setOpening(opening);
        }

        public final Boolean getOpening() {
            return bean().getOpening();
        }

        public void setReceived(Long received) {
            bean().setReceived(received);
        }

        public void setReceived(long received) {
            bean().setReceived(received);
        }


        public final void setReceived(AmqpSequenceNo received) {
            bean().setReceived(received);
        }

        public final AmqpSequenceNo getReceived() {
            return bean().getReceived();
        }

        public void setTimeout(Long timeout) {
            bean().setTimeout(timeout);
        }

        public void setTimeout(long timeout) {
            bean().setTimeout(timeout);
        }


        public final void setTimeout(AmqpUint timeout) {
            bean().setTimeout(timeout);
        }

        public final Long getTimeout() {
            return bean().getTimeout();
        }

        public final void setTxnMode(AmqpTxnLevel txnMode) {
            bean().setTxnMode(txnMode);
        }

        public final AmqpTxnLevel getTxnMode() {
            return bean().getTxnMode();
        }

        public final void setTxnSupport(AmqpTxnLevel txnSupport) {
            bean().setTxnSupport(txnSupport);
        }

        public final AmqpTxnLevel getTxnSupport() {
            return bean().getTxnSupport();
        }

        public void set(int index, AmqpType<?, ?> value) {
            bean().set(index, value);
        }

        public AmqpType<?, ?> get(int index) {
            return bean().get(index);
        }

        public int getListCount() {
            return bean().getListCount();
        }

        public Iterator<AmqpType<?, ?>> iterator() {
            return bean().iterator();
        }

        public AmqpAttach.AmqpAttachBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            return this;
        }

        protected AmqpAttach bean() {
            if(bean == null) {
                bean = new AmqpAttach.AmqpAttachBean(encoded.getValue());
                bean.buffer = this;
            }
            return bean;
        }

        public final void handle(AmqpCommandHandler handler) throws Exception {
            handler.handleAttach(this);
        }

        public boolean equals(Object o){
            return bean().equals(o);
        }

        public boolean equals(AmqpAttach o){
            return bean().equals(o);
        }

        public int hashCode() {
            return bean().hashCode();
        }

        public static AmqpAttach.AmqpAttachBuffer create(Encoded<IAmqpList<AmqpType<?, ?>>> encoded) {
            if(encoded.isNull()) {
                return null;
            }
            return new AmqpAttach.AmqpAttachBuffer(encoded);
        }

        public static AmqpAttach.AmqpAttachBuffer create(DataInput in, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError {
            return create(marshaller.unmarshalAmqpAttach(in));
        }

        public static AmqpAttach.AmqpAttachBuffer create(Buffer buffer, int offset, AmqpMarshaller marshaller) throws AmqpEncodingError {
            return create(marshaller.decodeAmqpAttach(buffer, offset));
        }
    }
}