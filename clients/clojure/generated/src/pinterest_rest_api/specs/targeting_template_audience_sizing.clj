(ns pinterest-rest-api.specs.targeting-template-audience-sizing
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-template-audience-sizing-reach-estimate :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-audience-sizing-data
  {
   (ds/opt :reach_estimate) targeting-template-audience-sizing-reach-estimate-spec
   })

(def targeting-template-audience-sizing-spec
  (ds/spec
    {:name ::targeting-template-audience-sizing
     :spec targeting-template-audience-sizing-data}))
