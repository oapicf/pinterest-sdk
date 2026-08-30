(ns pinterest-rest-api.specs.preferred-media-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def preferred-media-type-data
  {
   })

(def preferred-media-type-spec
  (ds/spec
    {:name ::preferred-media-type
     :spec preferred-media-type-data}))
