(ns pinterest-rest-api.specs.advertiser-defined-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag-type-optimal :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-event-data
  {
   (ds/opt :mapped_conversion_type) conversion-tag-type-optimal-spec
   (ds/opt :name) string?
   })

(def advertiser-defined-event-spec
  (ds/spec
    {:name ::advertiser-defined-event
     :spec advertiser-defined-event-data}))
