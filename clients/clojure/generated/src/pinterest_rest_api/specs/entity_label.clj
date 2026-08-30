(ns pinterest-rest-api.specs.entity-label
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-parent-type :refer :all]
            [pinterest-rest-api.specs.entity-label-status :refer :all]
            )
  (:import (java.io File)))


(def entity-label-data
  {
   (ds/req :entity_id) string?
   (ds/opt :entity_type) label-parent-type-spec
   (ds/req :label_id) string?
   (ds/opt :status) entity-label-status-spec
   })

(def entity-label-spec
  (ds/spec
    {:name ::entity-label
     :spec entity-label-data}))
