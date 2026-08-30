(ns pinterest-rest-api.specs.advertiser-defined-event-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advertiser-defined-event-mapping-type :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-event-input-data
  {
   (ds/req :mapped_conversion_type) advertiser-defined-event-mapping-type-spec
   (ds/req :name) string?
   })

(def advertiser-defined-event-input-spec
  (ds/spec
    {:name ::advertiser-defined-event-input
     :spec advertiser-defined-event-input-data}))
