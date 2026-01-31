(ns pinterest-rest-api.specs.conversion-tag-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-configs :refer :all]
            [pinterest-rest-api.specs.enhanced-match-status-type :refer :all]
            )
  (:import (java.io File)))


(def conversion-tag-common-data
  {
   (ds/opt :code_snippet) string?
   (ds/opt :configs) conversion-tag-configs-spec
   (ds/opt :enhanced_match_status) enhanced-match-status-type-spec
   (ds/opt :id) string?
   (ds/opt :last_fired_time_ms) float?
   (ds/req :name) string?
   (ds/opt :version) string?
   })

(def conversion-tag-common-spec
  (ds/spec
    {:name ::conversion-tag-common
     :spec conversion-tag-common-data}))
