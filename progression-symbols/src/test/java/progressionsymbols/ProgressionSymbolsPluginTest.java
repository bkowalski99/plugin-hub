package progressionsymbols;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ProgressionSymbolsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ProgressionSymbolsPlugin.class);
		RuneLite.main(args);
	}
}