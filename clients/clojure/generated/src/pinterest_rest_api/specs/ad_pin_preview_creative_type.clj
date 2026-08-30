(ns pinterest-rest-api.specs.ad-pin-preview-creative-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-pin-preview-creative-type-data
  {
   })

(def ad-pin-preview-creative-type-spec
  (ds/spec
    {:name ::ad-pin-preview-creative-type
     :spec ad-pin-preview-creative-type-data}))
