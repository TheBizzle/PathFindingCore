package org.bizzle.pathfinding

import
  org.bizzle.pathfinding.pathingmap.PathingMapSpec

import
  org.bizzle.tester.suite.SuiteReporter

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 1/18/12
 * Time: 10:57 PM
 */

object PathFindingSuiteReporter extends SuiteReporter(Seq(new PathingMapSpec()))
