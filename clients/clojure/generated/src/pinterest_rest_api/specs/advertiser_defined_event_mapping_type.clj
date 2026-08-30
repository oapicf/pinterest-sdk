(ns pinterest-rest-api.specs.advertiser-defined-event-mapping-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def advertiser-defined-event-mapping-type-data
  {
   })

(def advertiser-defined-event-mapping-type-spec
  (ds/spec
    {:name ::advertiser-defined-event-mapping-type
     :spec advertiser-defined-event-mapping-type-data}))
