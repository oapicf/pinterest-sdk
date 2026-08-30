(ns pinterest-rest-api.specs.ad-group-audience-sizing-creative-types
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-creative-types-data
  {
   })

(def ad-group-audience-sizing-creative-types-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-creative-types
     :spec ad-group-audience-sizing-creative-types-data}))
