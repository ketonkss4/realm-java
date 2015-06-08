package some.test;

import io.realm.RealmObject;
import io.realm.RealmList;

class MissingGenericType extends RealmObject {
    private RealmList list; // this is an error!

    public RealmList getList() {
        return list;
    }

    public void setList(RealmList list) {
        this.list = list;
    }
}