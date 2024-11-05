(ns pinterest-rest-api.specs.audience-insight-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-insight-type-data
  {
   })

(def audience-insight-type-spec
  (ds/spec
    {:name ::audience-insight-type
     :spec audience-insight-type-data}))
