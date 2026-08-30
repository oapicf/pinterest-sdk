//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_deletion_request_epik_targets.dart';
import 'package:openapi/src/model/conversion_deletion_request_user_email_targets.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'conversion_deletion_request_targets.g.dart';

/// ConversionDeletionRequestTargets
///
/// Properties:
/// * [userEmails] - Array of plain text user emails.
/// * [epiks] - Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
@BuiltValue()
abstract class ConversionDeletionRequestTargets implements Built<ConversionDeletionRequestTargets, ConversionDeletionRequestTargetsBuilder> {
  /// Any Of [ConversionDeletionRequestEPIKTargets], [ConversionDeletionRequestUserEmailTargets]
  AnyOf get anyOf;

  ConversionDeletionRequestTargets._();

  factory ConversionDeletionRequestTargets([void updates(ConversionDeletionRequestTargetsBuilder b)]) = _$ConversionDeletionRequestTargets;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestTargetsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequestTargets> get serializer => _$ConversionDeletionRequestTargetsSerializer();
}

class _$ConversionDeletionRequestTargetsSerializer implements PrimitiveSerializer<ConversionDeletionRequestTargets> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequestTargets, _$ConversionDeletionRequestTargets];

  @override
  final String wireName = r'ConversionDeletionRequestTargets';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequestTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequestTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  ConversionDeletionRequestTargets deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestTargetsBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(ConversionDeletionRequestUserEmailTargets), FullType(ConversionDeletionRequestEPIKTargets), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

