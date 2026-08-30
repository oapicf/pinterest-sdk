//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_ownership_type.g.dart';

class AudienceOwnershipType extends EnumClass {

  /// Filter audiences by ownership type.
  @BuiltValueEnumConst(wireName: r'OWNED')
  static const AudienceOwnershipType OWNED = _$OWNED;
  /// Filter audiences by ownership type.
  @BuiltValueEnumConst(wireName: r'RECEIVED')
  static const AudienceOwnershipType RECEIVED = _$RECEIVED;

  static Serializer<AudienceOwnershipType> get serializer => _$audienceOwnershipTypeSerializer;

  const AudienceOwnershipType._(String name): super(name);

  static BuiltSet<AudienceOwnershipType> get values => _$values;
  static AudienceOwnershipType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AudienceOwnershipTypeMixin = Object with _$AudienceOwnershipTypeMixin;

