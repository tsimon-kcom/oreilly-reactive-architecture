/**
 * Copyright © 2014, 2015 Typesafe, Inc. All rights reserved. [http://www.typesafe.com]
 */

package com.lightbend.training.coffeehouse;

import akka.actor.AbstractLoggingActor;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;

public class CoffeeHouse extends AbstractLoggingActor {

    public CoffeeHouse() {
        log().debug("CoffeeHouse Open");

        receive(ReceiveBuilder.
                matchAny(o -> log().info("Coffee Brewing")).build() // delete me
//                matchAny(o -> sender().tell("Coffee Brewing", self())).build()
        );
    }

    public static Props props() {
        return Props.create(CoffeeHouse.class, CoffeeHouse::new);
    }
}
