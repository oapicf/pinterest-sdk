(ns pinterest-rest-api.specs.media-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def media-type-data
  {
   })

(def media-type-spec
  (ds/spec
    {:name ::media-type
     :spec media-type-data}))
