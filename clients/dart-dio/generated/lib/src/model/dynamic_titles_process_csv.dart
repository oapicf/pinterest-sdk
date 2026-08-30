//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/dynamic_titles_process_csv_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_process_csv.g.dart';

/// DynamicTitlesProcessCSV
///
/// Properties:
/// * [errors] - List of validation errors. Empty on success.
/// * [status] - Processing status. Present on success.
@BuiltValue()
abstract class DynamicTitlesProcessCSV implements Built<DynamicTitlesProcessCSV, DynamicTitlesProcessCSVBuilder> {
  /// List of validation errors. Empty on success.
  @BuiltValueField(wireName: r'errors')
  BuiltList<DynamicTitlesProcessCSVError>? get errors;

  /// Processing status. Present on success.
  @BuiltValueField(wireName: r'status')
  String? get status;

  DynamicTitlesProcessCSV._();

  factory DynamicTitlesProcessCSV([void updates(DynamicTitlesProcessCSVBuilder b)]) = _$DynamicTitlesProcessCSV;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesProcessCSVBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesProcessCSV> get serializer => _$DynamicTitlesProcessCSVSerializer();
}

class _$DynamicTitlesProcessCSVSerializer implements PrimitiveSerializer<DynamicTitlesProcessCSV> {
  @override
  final Iterable<Type> types = const [DynamicTitlesProcessCSV, _$DynamicTitlesProcessCSV];

  @override
  final String wireName = r'DynamicTitlesProcessCSV';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesProcessCSV object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(DynamicTitlesProcessCSVError)]),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesProcessCSV object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesProcessCSVBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(DynamicTitlesProcessCSVError)]),
          ) as BuiltList<DynamicTitlesProcessCSVError>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesProcessCSV deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesProcessCSVBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

