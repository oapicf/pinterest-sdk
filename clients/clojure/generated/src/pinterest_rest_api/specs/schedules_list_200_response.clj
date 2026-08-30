(ns pinterest-rest-api.specs.schedules-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule :refer :all]
            )
  (:import (java.io File)))


(def schedules-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of schedule-spec)
   })

(def schedules-list-200-response-spec
  (ds/spec
    {:name ::schedules-list-200-response
     :spec schedules-list-200-response-data}))
