//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_targeting_strategy_items.g.dart';

class TargetingSpecTargetingStrategyItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CHOOSE_YOUR_OWN')
  static const TargetingSpecTargetingStrategyItems CHOOSE_YOUR_OWN = _$CHOOSE_YOUR_OWN;
  @BuiltValueEnumConst(wireName: r'FIND_NEW_CUSTOMERS')
  static const TargetingSpecTargetingStrategyItems FIND_NEW_CUSTOMERS = _$FIND_NEW_CUSTOMERS;
  @BuiltValueEnumConst(wireName: r'RECONNECT_WITH_USERS')
  static const TargetingSpecTargetingStrategyItems RECONNECT_WITH_USERS = _$RECONNECT_WITH_USERS;

  static Serializer<TargetingSpecTargetingStrategyItems> get serializer => _$targetingSpecTargetingStrategyItemsSerializer;

  const TargetingSpecTargetingStrategyItems._(String name): super(name);

  static BuiltSet<TargetingSpecTargetingStrategyItems> get values => _$values;
  static TargetingSpecTargetingStrategyItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TargetingSpecTargetingStrategyItemsMixin = Object with _$TargetingSpecTargetingStrategyItemsMixin;

