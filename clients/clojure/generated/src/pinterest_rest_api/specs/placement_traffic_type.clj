(ns pinterest-rest-api.specs.placement-traffic-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def placement-traffic-type-data
  {
   })

(def placement-traffic-type-spec
  (ds/spec
    {:name ::placement-traffic-type
     :spec placement-traffic-type-data}))
