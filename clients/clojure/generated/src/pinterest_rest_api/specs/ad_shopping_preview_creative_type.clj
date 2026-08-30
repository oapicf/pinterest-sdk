(ns pinterest-rest-api.specs.ad-shopping-preview-creative-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-shopping-preview-creative-type-data
  {
   })

(def ad-shopping-preview-creative-type-spec
  (ds/spec
    {:name ::ad-shopping-preview-creative-type
     :spec ad-shopping-preview-creative-type-data}))
