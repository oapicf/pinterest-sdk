(ns pinterest-rest-api.specs.placement-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.placement-type :refer :all]
            )
  (:import (java.io File)))


(def placement-multipliers-data
  {
   (ds/opt :PLACEMENT) placement-type-spec
   })

(def placement-multipliers-spec
  (ds/spec
    {:name ::placement-multipliers
     :spec placement-multipliers-data}))
