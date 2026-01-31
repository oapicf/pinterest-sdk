(ns pinterest-rest-api.specs.targeting-spec-age-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-age-bucket-data
  {
   })

(def targeting-spec-age-bucket-spec
  (ds/spec
    {:name ::targeting-spec-age-bucket
     :spec targeting-spec-age-bucket-data}))
