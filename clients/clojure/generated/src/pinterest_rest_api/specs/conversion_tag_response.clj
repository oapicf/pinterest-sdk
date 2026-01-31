(ns pinterest-rest-api.specs.conversion-tag-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-configs :refer :all]
            [pinterest-rest-api.specs.enhanced-match-status-type :refer :all]
            [pinterest-rest-api.specs.entity-status :refer :all]
            )
  (:import (java.io File)))


(def conversion-tag-response-data
  {
   (ds/opt :code_snippet) string?
   (ds/opt :configs) conversion-tag-configs-spec
   (ds/opt :enhanced_match_status) enhanced-match-status-type-spec
   (ds/opt :id) string?
   (ds/opt :last_fired_time_ms) float?
   (ds/req :name) string?
   (ds/opt :version) string?
   (ds/req :ad_account_id) string?
   (ds/opt :status) entity-status-spec
   })

(def conversion-tag-response-spec
  (ds/spec
    {:name ::conversion-tag-response
     :spec conversion-tag-response-data}))
