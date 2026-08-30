(ns pinterest-rest-api.specs.base-preferred-media-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def base-preferred-media-type-data
  {
   })

(def base-preferred-media-type-spec
  (ds/spec
    {:name ::base-preferred-media-type
     :spec base-preferred-media-type-data}))
