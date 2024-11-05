(ns pinterest-rest-api.specs.conversion-event-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-type :refer :all]
            )
  (:import (java.io File)))


(def conversion-event-response-data
  {
   (ds/opt :conversion_event) conversion-tag-type-spec
   (ds/opt :conversion_tag_id) string?
   (ds/opt :ad_account_id) string?
   (ds/opt :created_time) int?
   })

(def conversion-event-response-spec
  (ds/spec
    {:name ::conversion-event-response
     :spec conversion-event-response-data}))
