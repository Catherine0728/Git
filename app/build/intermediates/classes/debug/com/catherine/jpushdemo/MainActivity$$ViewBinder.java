// Generated code from Butter Knife. Do not modify!
package com.catherine.jpushdemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.catherine.jpushdemo.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492954, "field 'init'");
    target.init = finder.castView(view, 2131492954, "field 'init'");
    view = finder.findRequiredView(source, 2131492955, "field 'stopPush'");
    target.stopPush = finder.castView(view, 2131492955, "field 'stopPush'");
    view = finder.findRequiredView(source, 2131492956, "field 'resumePush'");
    target.resumePush = finder.castView(view, 2131492956, "field 'resumePush'");
    view = finder.findRequiredView(source, 2131492957, "field 'msgRec'");
    target.msgRec = finder.castView(view, 2131492957, "field 'msgRec'");
    view = finder.findRequiredView(source, 2131492958, "field 'setting'");
    target.setting = finder.castView(view, 2131492958, "field 'setting'");
  }

  @Override public void unbind(T target) {
    target.init = null;
    target.stopPush = null;
    target.resumePush = null;
    target.msgRec = null;
    target.setting = null;
  }
}
