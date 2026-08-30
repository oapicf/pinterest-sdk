(ns pinterest-rest-api.specs.ads-credit-discount-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-credit-discount-type-data
  {
   })

(def ads-credit-discount-type-spec
  (ds/spec
    {:name ::ads-credit-discount-type
     :spec ads-credit-discount-type-data}))
