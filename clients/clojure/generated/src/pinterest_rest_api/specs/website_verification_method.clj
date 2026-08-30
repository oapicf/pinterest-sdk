(ns pinterest-rest-api.specs.website-verification-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def website-verification-method-data
  {
   })

(def website-verification-method-spec
  (ds/spec
    {:name ::website-verification-method
     :spec website-verification-method-data}))
