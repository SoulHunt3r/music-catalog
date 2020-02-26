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

/**
 * Generic description
 * <p>
 * using https://github.com/dorkbox/MessageBus
 *
 * @author Fedorov Konstantin (mr.fedorov.konstantin@mail.ru)
 * @version 0.1.0 [MAJOR.MINOR.PATCH]
 * Created on 06.02.2020.
 */
public class AppMessageBus {
    private static MessageBus sInstance;

    /**
     * create, store and return MessageBus instance
     *
     * @return {@link dorkbox.messageBus.MessageBus} instance
     */
    public static MessageBus getInstance() {
        if (sInstance == null) {
            synchronized (AppMessageBus.class) {
                if (sInstance == null) {
                    sInstance = new MessageBus();
                }
            }
        }
        return sInstance;
    }
}
