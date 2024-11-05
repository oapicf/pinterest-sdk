(ns pinterest-rest-api.specs.conversion-tag-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.enhanced-match-status-type :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            [pinterest-rest-api.specs.conversion-tag-configs :refer :all]
            )
  (:import (java.io File)))


(def conversion-tag-common-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :code_snippet) string?
   (ds/opt :enhanced_match_status) enhanced-match-status-type-spec
   (ds/opt :id) string?
   (ds/opt :last_fired_time_ms) float?
   (ds/opt :name) string?
   (ds/opt :status) entity-status-spec
   (ds/opt :version) string?
   (ds/opt :configs) conversion-tag-configs-spec
   })

(def conversion-tag-common-spec
  (ds/spec
    {:name ::conversion-tag-common
     :spec conversion-tag-common-data}))
