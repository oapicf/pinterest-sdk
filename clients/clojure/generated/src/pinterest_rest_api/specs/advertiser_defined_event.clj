(ns pinterest-rest-api.specs.advertiser-defined-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def advertiser-defined-event-data
  {
   (ds/opt :name) string?
   (ds/opt :mapped_conversion_type) string?
   })

(def advertiser-defined-event-spec
  (ds/spec
    {:name ::advertiser-defined-event
     :spec advertiser-defined-event-data}))
