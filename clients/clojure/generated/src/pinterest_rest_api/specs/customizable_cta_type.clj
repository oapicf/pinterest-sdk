(ns pinterest-rest-api.specs.customizable-cta-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customizable-cta-type-data
  {
   })

(def customizable-cta-type-spec
  (ds/spec
    {:name ::customizable-cta-type
     :spec customizable-cta-type-data}))
