/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.apm.server.service;

import io.holoinsight.server.apm.common.model.query.Event;

import java.util.List;
import java.util.Map;

public interface EventService {

  List<Event> queryEvents(String tenant, long startTime, long endTime,
      Map<String, String> termParams) throws Exception;

  void insert(List<Event> events) throws Exception;
}
