(ns pinterest-rest-api.specs.public-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-targeting-type-data
  {
   })

(def public-targeting-type-spec
  (ds/spec
    {:name ::public-targeting-type
     :spec public-targeting-type-data}))
