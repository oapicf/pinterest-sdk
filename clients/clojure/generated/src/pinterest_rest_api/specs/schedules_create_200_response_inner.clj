(ns pinterest-rest-api.specs.schedules-create-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedules-create-200-response-inner-data :refer :all]
            )
  (:import (java.io File)))


(def schedules-create-200-response-inner-data
  {
   (ds/req :data) schedules-create-200-response-inner-data-spec
   })

(def schedules-create-200-response-inner-spec
  (ds/spec
    {:name ::schedules-create-200-response-inner
     :spec schedules-create-200-response-inner-data}))
