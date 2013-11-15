package net.simpleframework.module.settings.impl;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ctx.Module;
import net.simpleframework.ctx.service.ado.db.AbstractDbModuleContext;
import net.simpleframework.module.settings.ISettingsContext;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class SettingsContext extends AbstractDbModuleContext implements ISettingsContext {

	@Override
	protected Module createModule() {
		return new Module().setName(MODULE_NAME).setText($m("SettingsContext.0")).setOrder(3);
	}

	@Override
	public PreferencesPluginRegistry getPluginRegistry() {
		return singleton(PreferencesPluginRegistry.class);
	}
}
