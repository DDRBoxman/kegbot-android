/*
 * Copyright 2012 Mike Wakerly <opensource@hoho.com>.
 *
 * This file is part of the Kegtab package from the Kegbot project. For
 * more information on Kegtab or Kegbot, see <http://kegbot.org/>.
 *
 * Kegtab is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation, version 2.
 *
 * Kegtab is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with Kegtab. If not, see <http://www.gnu.org/licenses/>.
 */
package org.kegbot.app;

/**
 * Constants involving broadcasts.
 */
public class KegtabBroadcast {

  /**
   * Action set when a new temperature reading is recorded.
   */
  public static final String ACTION_THERMO_UPDATE = "org.kegbot.action.THERMO_UPDATE";
  public static final String THERMO_UPDATE_EXTRA_SENSOR_NAME = "sensor_name";
  public static final String THERMO_UPDATE_EXTRA_TEMP_C = "temp_c";

  public static final String ACTION_USER_AUTHED = "org.kegbot.action.USER_AUTHED";
  public static final String USER_AUTHED_EXTRA_USERNAME = "username";
  public static final String USER_AUTHED_EXTRA_TAP_NAME = "tap_name";

  public static final String DRINKER_SELECT_EXTRA_TAP_NAME = "tap";

  public static final String ACTION_TOKEN_ADDED = "org.kegbot.action.TOKEN_ADDED";
  public static final String TOKEN_ADDED_EXTRA_AUTH_DEVICE = "auth_device";
  public static final String TOKEN_ADDED_EXTRA_TOKEN_VALUE = "token";

  private KegtabBroadcast() {
    throw new IllegalStateException("Non-instantiable class.");
  }

}
