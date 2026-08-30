(ns pinterest-rest-api.specs.entity-data-change-history
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.change-history-data-type :refer :all]
            )
  (:import (java.io File)))


(def entity-data-change-history-data
  {
   (ds/opt :changed_field_id) string?
   (ds/opt :changed_field_name) string?
   (ds/opt :data_type) change-history-data-type-spec
   (ds/opt :new_data_value) string?
   (ds/opt :old_data_value) string?
   })

(def entity-data-change-history-spec
  (ds/spec
    {:name ::entity-data-change-history
     :spec entity-data-change-history-data}))
