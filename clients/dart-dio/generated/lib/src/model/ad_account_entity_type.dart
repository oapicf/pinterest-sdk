//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_entity_type.g.dart';

class AdAccountEntityType extends EnumClass {

  /// Specify the entity type to get summary information
  @BuiltValueEnumConst(wireName: r'ADVERTISER')
  static const AdAccountEntityType ADVERTISER = _$ADVERTISER;
  /// Specify the entity type to get summary information
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const AdAccountEntityType CAMPAIGN = _$CAMPAIGN;
  /// Specify the entity type to get summary information
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const AdAccountEntityType AD_GROUP = _$AD_GROUP;
  /// Specify the entity type to get summary information
  @BuiltValueEnumConst(wireName: r'AD')
  static const AdAccountEntityType AD = _$AD;

  static Serializer<AdAccountEntityType> get serializer => _$adAccountEntityTypeSerializer;

  const AdAccountEntityType._(String name): super(name);

  static BuiltSet<AdAccountEntityType> get values => _$values;
  static AdAccountEntityType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdAccountEntityTypeMixin = Object with _$AdAccountEntityTypeMixin;

