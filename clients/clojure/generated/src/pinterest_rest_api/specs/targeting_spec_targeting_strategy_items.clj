(ns pinterest-rest-api.specs.targeting-spec-targeting-strategy-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-targeting-strategy-items-data
  {
   })

(def targeting-spec-targeting-strategy-items-spec
  (ds/spec
    {:name ::targeting-spec-targeting-strategy-items
     :spec targeting-spec-targeting-strategy-items-data}))
