/*
 *    Copyright 2020 Konstantin Fedorov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ru.dfkzbt.utils.music.catalog.bus;

import dorkbox.messageBus.MessageBus;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Generic description
 *
 * @author Fedorov Konstantin (mr.fedorov.konstantin@mail.ru)
 * @version 0.1.0 [MAJOR.MINOR.PATCH]
 * Created on 26.02.2020.
 */
public class AppMessageBusTest {
    private final static Logger logger = LoggerFactory.getLogger(AppMessageBusTest.class);

    @Test
    public void getInstanceNotNull() {
        MessageBus bus = AppMessageBus.getInstance();

        logger.debug("bus instance: {}", bus);

        assertNotNull(bus);
    }

    @Test
    public void getInstanceSame() {
        MessageBus bus = AppMessageBus.getInstance();
        MessageBus bus2 = AppMessageBus.getInstance();

        logger.debug("bus instance: {}", bus);
        logger.debug("bus instance2: {}", bus2);

        assertSame(bus, bus2);
    }
}