(ns pinterest-rest-api.specs.targeting-template-audience-sizing-reach-estimate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-template-audience-sizing-reach-estimate-data
  {
   (ds/opt :estimate) int?
   (ds/opt :lower_bound) int?
   (ds/opt :upper_bound) int?
   })

(def targeting-template-audience-sizing-reach-estimate-spec
  (ds/spec
    {:name ::targeting-template-audience-sizing-reach-estimate
     :spec targeting-template-audience-sizing-reach-estimate-data}))
