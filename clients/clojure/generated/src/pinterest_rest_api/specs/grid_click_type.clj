(ns pinterest-rest-api.specs.grid-click-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def grid-click-type-data
  {
   })

(def grid-click-type-spec
  (ds/spec
    {:name ::grid-click-type
     :spec grid-click-type-data}))
