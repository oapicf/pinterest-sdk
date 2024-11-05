(ns pinterest-rest-api.specs.targeting-spec-app-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-app-type-data
  {
   })

(def targeting-spec-app-type-spec
  (ds/spec
    {:name ::targeting-spec-app-type
     :spec targeting-spec-app-type-data}))
