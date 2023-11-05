package io.ebeaninternal.server.autotune.service;

import io.ebean.DatabaseBuilder;
import io.ebeaninternal.api.SpiEbeanServer;
import io.ebeaninternal.server.autotune.AutoTuneService;
import io.ebeaninternal.server.autotune.AutoTuneServiceProvider;

public class AutoTuneServiceFactory implements AutoTuneServiceProvider {

  @Override
  public AutoTuneService create(SpiEbeanServer server, DatabaseBuilder config) {
    return new DefaultAutoTuneService(server, config);
  }

}
