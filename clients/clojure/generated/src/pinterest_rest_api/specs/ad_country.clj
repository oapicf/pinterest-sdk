(ns pinterest-rest-api.specs.ad-country
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-country-data
  {
   })

(def ad-country-spec
  (ds/spec
    {:name ::ad-country
     :spec ad-country-data}))
