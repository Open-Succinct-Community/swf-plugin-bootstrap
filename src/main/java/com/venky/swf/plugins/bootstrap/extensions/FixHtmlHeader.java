package com.venky.swf.plugins.bootstrap.extensions;

import com.venky.extension.Extension;
import com.venky.extension.Registry;
import com.venky.swf.path.Path;
import com.venky.swf.views.controls.page.Css;
import com.venky.swf.views.controls.page.Head;
import com.venky.swf.views.controls.page.Script;

public class FixHtmlHeader implements Extension {
    static {
        Registry.instance().registerExtension("before.create.head",new FixHtmlHeader());
    }
    @Override
    public void invoke(Object... context) {
        Path path = (Path)context[0];
        Head head =  (Head) context[1];
        head.addControl(new Css("/resources/scripts/node_modules/bootstrap/dist/css/bootstrap.min.css"));
        head.addControl(new Css("/resources/scripts/node_modules/@fortawesome/fontawesome-free/css/all.min.css"));
        head.addControl(new Css("/resources/scripts/node_modules/tablesorter/dist/css/theme.bootstrap.min.css"));
        head.addControl(new Css("/resources/scripts/node_modules/bootstrap4-datetimepicker/build/css/bootstrap-datetimepicker.min.css"));

        head.addControl(new Script("/resources/scripts/node_modules/jquery/dist/jquery.min.js",false));
        head.addControl(new Script("/resources/scripts/node_modules/popper.js/dist/umd/popper.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/bootstrap/dist/js/bootstrap.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/tablesorter/dist/js/jquery.tablesorter.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/tablesorter/dist/js/jquery.tablesorter.widgets.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/bootstrap-ajax-typeahead/bootstrap-typeahead.js"));
        head.addControl(new Script("/resources/scripts/node_modules/moment/min/moment-with-locales.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/bootstrap4-datetimepicker/build/js/bootstrap-datetimepicker.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/lockr/lockr.min.js"));
        head.addControl(new Script("/resources/scripts/node_modules/mermaid/dist/mermaid.min.js"));
    }
}
