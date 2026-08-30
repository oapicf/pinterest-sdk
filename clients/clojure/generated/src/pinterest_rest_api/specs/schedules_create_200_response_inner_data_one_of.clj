(ns pinterest-rest-api.specs.schedules-create-200-response-inner-data-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def schedules-create-200-response-inner-data-one-of-data
  {
   (ds/req :id) string?
   (ds/req :schedule_id) string?
   (ds/req :exceptions) pinterest/lib/error-spec
   })

(def schedules-create-200-response-inner-data-one-of-spec
  (ds/spec
    {:name ::schedules-create-200-response-inner-data-one-of
     :spec schedules-create-200-response-inner-data-one-of-data}))
