package net.simpleframework.module.settings;

import net.simpleframework.ctx.IModuleContext;
import net.simpleframework.module.common.plugin.ModulePluginRegistry;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public interface ISettingsContext extends IModuleContext {

	static String MODULE_NAME = "simple-module-preferences";

	/**
	 * 
	 * @return
	 */
	PreferencesPluginRegistry getPluginRegistry();

	public static class PreferencesPluginRegistry extends ModulePluginRegistry<ISettingsPlugin> {
	}
}